package DevetoPredavanje.Enumareted;

import OsmoPredavanje.Profesor;
import OsmoPredavanje.Snake;

public class EnumExecutor {
    public static void main(String[] args) {
        Profesor profesor = new Profesor();
        Snake snake = new Snake("Eustahije Brzić");
        profesor.setAnimal(snake);

        Season ljeto = new Season(6,9,"ljeto");
        System.out.println(ljeto.hashCode());
        Season jesen = new Season(9,12,"jesen");
        Season zima = new Season(12,3,"zima");
        Season proljeće = new Season(3,6,"proljeće");

        SeasonEnum ljetoEnum = SeasonEnum.LJETO;



    }
}
