public class Phone {
    private int id;
    private String FIO,
            addres,
            nomber,
            kredit,
            debet;

    public Phone(int id, String FIO, String addres, String nomber, String kredit, String debet) {
        this.id = id;
        this.FIO = FIO;
        this.addres = addres;
        this.nomber = nomber;
        this.kredit = kredit;
        this.debet = debet;
    }

    public int getId() {
        return id;
    }

    public String getFIO() {
        return FIO;
    }

    public String getAddres() {
        return addres;
    }

    public String getNomber() {
        return nomber;
    }

    public String getKredit() {
        return kredit;
    }

    public String getDebet() {
        return debet;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                ", addres='" + addres + '\'' +
                ", nomber='" + nomber + '\'' +
                ", kredit='" + kredit + '\'' +
                ", debet='" + debet + '\'' +
                '}';
    }

}