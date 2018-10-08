package com.example.admin.retrofitcricket;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

class Cricket {

    public List<Batsman> getBatsman() {
        return batsman;
    }

    public List<Bowlers> getBowlers() {
        return bowlers;
    }
    @SerializedName("batsman")
    @Expose private List<Batsman> batsman=null;
    @SerializedName("bowlers")
    @Expose private List<Bowlers> bowlers=null;
    public class Batsman {
        public String getName() {
            return name;
        }

        public String getAverage() {
            return average;
        }

        public String getAge() {
            return age;
        }

        public String getInns() {
            return inns;
        }
        @SerializedName("name")
        @Expose String name;
        @SerializedName("average")
        @Expose String average;
        @SerializedName("age")
        @Expose String age;
        @SerializedName("inns")
        @Expose String inns;
    }

    public class Bowlers {


        public String getName() {
            return name;
        }

        public String getAverage() {
            return average;
        }

        public String getAge() {
            return age;
        }

        public String getInns() {
            return inns;
        }
        @SerializedName("name")
        @Expose String name;
        @SerializedName("average")
        @Expose String average;
        @SerializedName("age")
        @Expose String age;
        @SerializedName("inns")
        @Expose String inns;
    }
}
