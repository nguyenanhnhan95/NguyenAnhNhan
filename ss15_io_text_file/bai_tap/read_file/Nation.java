package ss15_io_text_file.bai_tap.read_file;

public class Nation {
    private String cout;
    private String code;
    private String name;

    public Nation() {
    }

    public Nation(String cout, String code, String name) {
        this.cout = cout;
        this.code = code;
        this.name = name;
    }

    public String getCout() {
        return cout;
    }

    public void setCout(String cout) {
        this.cout = cout;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "cout='" + cout + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getData() {
        return getCode() + "," + getCode() + "," + getName();
    }
}
