package covariant;

public class HealthyBurgerFactory extends BurgerFactory {

    @Override
    public HealthyBurger creatBurger() {
        return new HealthyBurger();
    }
}
