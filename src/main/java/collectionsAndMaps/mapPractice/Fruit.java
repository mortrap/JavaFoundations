package collectionsAndMaps.mapPractice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class Fruit extends HelpfulFood {
    private String name;
    private String kind;
    private String vitamins;

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + getName() + '\'' +
                ", kind='" + getKind() + '\'' +
                ", vitamins='" + getVitamins() + '\'' +
                '}';
    }
}
