package np.edu.asm.asmt.Utils;

public class Item {

    String name, desc;

    public Item() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public Item(String name, String desc) {

        this.name = name;
        this.desc = desc;
    }
}
