package collectionsAndMaps.mapPractice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Berry extends HelpfulFood {
    private String name;
    private String kind;
    private String vitamins;

    @Override
    public String toString() {
        return "Berry{" +
                "name='" + getName() + '\'' +
                ", kind='" + getKind() + '\'' +
                ", vitamins='" + getVitamins() + '\'' +
                '}';
    }

}
