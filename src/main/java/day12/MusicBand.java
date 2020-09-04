package day12;

import java.util.HashSet;
import java.util.Set;

public class MusicBand {
    private String name;
    private int year;
    private Set<String> members;


    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.members = new HashSet<>();
    }

    public Set<String> getMembers() {
        return members;
    }

    public void setMembers(Set<String> members) {
        this.members = members;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" + getName() + ", " + getYear() + " }";
    }

    ;

    public void mergeMember(MusicBand bandB) {
        this.getMembers().addAll(bandB.getMembers());
        bandB.getMembers().clear();
    }

}
