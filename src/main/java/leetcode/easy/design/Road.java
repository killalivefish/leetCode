package leetcode.easy.design;

public class Road {
    private String name;
    private int licheng;

    public Road(String name, int licheng) {
        this.name = name;
        this.licheng = licheng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLicheng() {
        return licheng;
    }

    public void setLicheng(int licheng) {
        this.licheng = licheng;
    }
}
