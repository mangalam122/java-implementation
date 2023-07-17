package com.queue.practice;

public class StudentMarks implements Comparable<StudentMarks> {
    private int physics;
     private int maths;


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + physics;
        result = prime * result + maths;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StudentMarks other = (StudentMarks) obj;
        if (physics != other.physics)
            return false;
        if (maths != other.maths)
            return false;
        return true;
    }
    public StudentMarks(int physics, int maths) {
        this.physics = physics;
        this.maths = maths;
    }
    public int getPhysics() {
        return physics;
    }
  
    public int getMaths() {
        return maths;
    }
    @Override
    public int compareTo(StudentMarks o) {
         System.out.println("to compare () is called");
        if(this.maths>o.maths){
            return -1;
        }
        if(this.maths<o.maths){
            return 1;
        }
        if(this.maths==o.maths){
            return 0;
        }
       
        return 0;
        
    }
    @Override
    public String toString() {
        System.out.println("to string is called");
        return "StudentMarks [physics=" + physics + ", maths=" + maths + "]";
    }
}
