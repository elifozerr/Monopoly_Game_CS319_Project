package sample;

public class AlienAttack extends CardDecorator{


    Card card;

    public AlienAttack(Card card){

        this.card = card;
    }
    @Override
    public String getContent() {

        return card.getContent() + "Alien Attack.";
    }

    @Override
    public void duty() {

    }
}