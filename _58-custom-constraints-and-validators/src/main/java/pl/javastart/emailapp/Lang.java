package pl.javastart.emailapp;

public enum Lang {

    PL(new String[]{"kurka", "cholercia"}),
    EN(new String[]{"fak"}),
    DE(new String[]{"scheiße"});

    private final String[] badWords;

    Lang(String[] badWords) {
        this.badWords = badWords;
    }

    public String[] getBadWords() {
        return badWords;
    }
}
