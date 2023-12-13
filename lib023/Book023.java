package lib023;

import u023Chakhrit.Util023Chakhrit;

public class Book023 {
    private final long isbn023;
    private final String title023;
    private final double price023;

    public Book023(String title023, double price023) {
        if (title023 == null || title023.isBlank() || price023 <= 0)
            throw new IllegalArgumentException("Invalid Initializtion");
        this.title023 = title023;
        this.price023 = price023;
        var temp = Util023Chakhrit.unique023Chakhrit();
        var digit = Util023Chakhrit.checkDigit023(temp);
        isbn023 = temp * 10 + digit;
    }

    public long getIsbn023() {
        return isbn023;
    }

    public String getTitle023() {
        return title023;
    }

    public double getPrice023() {
        return price023;
    }

    @Override
    public String toString(){
        return String.format("Book(%02d-%05d-%04d-%01d,%s,%.2f)" ,
                isbn023 / 1_00000_0000_0L % 1_00,
                isbn023 / 1_0000_0 % 10000,
                isbn023 / 1_0 % 1_000,
                isbn023 % 1_0,
                title023,
                price023);
    }

    @Override
    public boolean equals(Object o) {
        return(this == o) ;
    }

    @Override
    public int hashCode() {
        return (int)(isbn023);
    }
}
