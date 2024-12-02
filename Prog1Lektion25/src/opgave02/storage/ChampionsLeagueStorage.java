package opgave02.storage;

import opgave02.models.Team;

public class ChampionsLeagueStorage {
    private Team[] groupA = {
            new Team("Bayern München", 13, 11, 6),
            new Team("FC København", 5, 7, 8),
            new Team("Galatasaray", 5, 10, 12),
            new Team("Manchester United", 4, 12, 14)
    };
    private Team[] groupB = {
            new Team("Arsenal", 13, 11, 6),
            new Team("PSV Eindhoven", 8, 7, 9),
            new Team("Lens", 5, 4, 10),
            new Team("Sevilla", 2, 6, 10)
    };

    public Team[] getGroupA() {
        return groupA;
    }
    public Team[] getGroupB() {
        return groupB;
    }
 }
