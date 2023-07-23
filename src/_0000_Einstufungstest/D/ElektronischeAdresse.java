package _0000_Einstufungstest.D;

class ElektronischeAdresse implements Adresse {
    private String mail;

    public ElektronischeAdresse(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return mail;
    }
}
