package ac.za.cput.company_manager.domain;


import java.io.Serializable;

public class Container implements Serializable{

    private  int containerSize;

    public Container(){}

    public int getContainerSize()
    {
        return containerSize;
    }

    public Container(Builder build)
    {
        containerSize = build.containerSize;
    }

    public static  class Builder
    {
        private int containerSize;

        public Builder(int containerSize)
        {
            this.containerSize = containerSize;
        }


        public Builder copy(Container value)
        {
            this.containerSize = value.containerSize;
            return this;
        }

        public Container build()
        {
            return new Container(this);
        }

    }


}
