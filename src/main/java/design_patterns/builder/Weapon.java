package design_patterns.builder;

public class Weapon {
    private final Integer calibre;
    private final String type;
    private final Integer size;

    // constructor turi buti private
    private Weapon(String type, Integer size, Integer calibre) {
        this.type = type;
        this.size = size;
        this.calibre = calibre;
    }

    public String getType() {
        return type;
    }

    public Integer getSize() {
        return size;
    }

    // statine klase vidine
    public static class Builder {
        private Integer calibre;
        private String type;
        private Integer size;

        // cia mes nustatome privalomus parametrus, be kuriu objektas negali buti sukuriamas
        public Builder(Integer calibre) {
            this.calibre = calibre;
        }

        public Builder withType(String type) {
            this.type = type;
            return this;
        }

        public Builder withSize(Integer size) {
            this.size = size;
            return this;
        }

        public Weapon build(){
            return new Weapon(type, size, calibre);
        }
    }
}
