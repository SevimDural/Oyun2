public abstract class SavasLoc extends Location {
    protected Canavar cav;
    protected String odul;

    SavasLoc(Player player, String name,Canavar cav, String odul ) {
        super(player);
        this.name=name;
        this.cav=cav;
        this.odul=odul;

    }

    public boolean getLocation(){
        return true;
    }


}
