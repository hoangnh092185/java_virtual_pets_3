public class Monster {
  private String name;
  private int personId;
  private int id;

  public Monster(String name, int personId) {
    this.name = name;
    this.personId = personId;
  }

  public String getName(){
    return name;
  }
  public int getPersonId(){
    return personId;
  }
  public int getId(){
    return id;
  }
  public static List<Monster> all() {
    String sql = "SELECT * FROM monsters";
    try(Connection con = DB.sql2o.open()) {
     return con.createQuery(sql).executeAndFetch(Monster.class);
    }
  }

}
