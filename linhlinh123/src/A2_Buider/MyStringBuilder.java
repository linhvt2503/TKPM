package A2_Buider;

public class MyStringBuilder {
    String s;
    float f;
    boolean b;
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(s).append("\n")
                .append(f).append("\n")
                .append(b);
        return builder.toString();
    }
    public MyStringBuilder(Builder builder) {
        this.s = builder.s;
        this.f = builder.f;
        this.b = builder.b;
    }

    public static class Builder{
        private String s;
        private float f;
        private boolean b;

        public Builder addString(String s) {
            this.s = s;
            return this;
        }

        public Builder addFloat(float f) {
            this.f = f;
            return this;
        }

        public Builder addBool(boolean b) {
            this.b = b;
            return this;
        }

        public MyStringBuilder builder(){
            return new MyStringBuilder(this);
        }
    }
}

