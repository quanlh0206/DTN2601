package entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float score;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.score = 0;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        if (score >= 0 && score <= 10){
            this.score = score;
        }else {
            System.out.println("Điểm không hợp lệ. Vui lòng nhập lại");
        }
    }

    public void addScore(float score) {
        if(this.score + score <= 10 && this.score + score >= 0) {
            this.score += score;
        }else {
            System.out.println("Điểm không hợp lệ");
        }
    }

    public void infoStudent(){
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Quê Quán: " + hometown);

        String rank;

        if(score < 4){
            rank = "Yếu";
        } else if (score <6) {
            rank = "Trung bình";
        } else if (score < 8) {
            rank = "Khá";
        } else {
            rank ="Giỏi";
        }

        System.out.println("Xếp loại: " + rank);
    }
}
