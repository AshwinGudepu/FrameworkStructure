package problem;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass() )
            return false;
        HeavenlyBody other = (HeavenlyBody) obj;
        if (!name.equals(other.name))
            return false;
        if (orbitalPeriod != other.orbitalPeriod)
            return false;
        if (satellites == null && other.satellites != null)
            return false;
        else if (satellites.hashCode()!= other.satellites.hashCode())
            return false;
        return true;

    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (int) orbitalPeriod;
        result = prime * result + ((satellites == null) ? 0 : satellites.hashCode());
        return result;
    }
}
