package BackEnd;

import BackEnd.Amenities.*;

import java.util.ArrayList;

public class Catalog {

    private ArrayList<Amenity> list;

    public Catalog(ArrayList<Amenity> list) {
        this.list = list;
    }

    public Catalog(){
        this.list = new ArrayList<>();
    }

    public void populateCatalog(){
        Dinning dinner = new Dinning(
                "Dinning",
                true,
                19.99,
                "A delicious meal fit for a king.",
                "dinner",
                false);
        list.add(dinner);

        Hiking hikingLakeSuperior = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along Lake Superior.",
                "coastal",
                "Lake Superior",
                1);
        list.add(hikingLakeSuperior);

        Hiking hikingGrandPortageTrail = new Hiking(
                "Hiking",
                true,
                29.99,
                "You get tour guide to show you the best views along the Grand Portage Trail.",
                "inland",
                "Grand Portage Trail",
                2);
        list.add(hikingGrandPortageTrail);

        Kayaking kayakingLakeSuperior = new Kayaking(
                "Kayaking",
                true,
                49.99,
                "You get tour guide to show you the best views along the Lake Superior.",
                "Lake Superior",
                "Medium",
                false
                );
        list.add(kayakingLakeSuperior);

        Kayaking kayakingSaintLouisRiver = new Kayaking(
                "Kayaking",
                true,
                49.99,
                "You get tour guide to show you the best views along the Saint Louis River.",
                "Saint Louis River",
                "Hard",
                false
        );
        list.add(kayakingSaintLouisRiver);

        Movie avengersEndGame = new Movie(
                "Movie",
                true,
                4.99,
                "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
                "Avengers End Game",
                "3 hours 1 min"
        );
        list.add(avengersEndGame);

        Movie yourName = new Movie(
                "Movie",
                true,
                4.99,
                "Two teenagers share a profound, magical connection upon discovering they are swapping bodies. Things manage to become even more complicated when the boy and girl decide to meet in person.",
                "Your Name",
                "1 hour 46 min"
        );
        list.add(yourName);

        Skiing skiingSpiritMountain = new Skiing(
                "Skiing",
                true,
                49.99,
                "You go on a skiing on Spirit Mountain.",
                "Spirit Mountain",
                "Medium",
                false
        );
        list.add(skiingSpiritMountain);

    }


    public ArrayList<Amenity> getList() {
        return list;
    }

    public void setList(ArrayList<Amenity> list) {
        this.list = list;
    }

    public Movie getMovieInstanceOfIndexedObject(int index) {
        if (list.get(index) instanceof Movie) {
            return (Movie) list.get(index);
        } else {
            return null;
        }
    }

    public Skiing getSkiingInstanceOfIndexedObject(int index) {
        if (list.get(index) instanceof Skiing) {
            return (Skiing) list.get(index);
        } else {
            return null;
        }
    }

    public Dinning getDinningInstanceOfIndexedObject(int index) {
        if (list.get(index) instanceof Dinning) {
            return (Dinning) list.get(index);
        } else {
            return null;
        }
    }

    public Hiking getHikingInstanceOfIndexedObject(int index) {
        if (list.get(index) instanceof Hiking) {
            return (Hiking) list.get(index);
        } else {
            return null;
        }
    }

    public Kayaking getKayakingInstanceOfIndexedObject(int index) {
        if (list.get(index) instanceof Kayaking) {
            return (Kayaking) list.get(index);
        } else {
            return null;
        }
    }

    public void addAmenity(Amenity amenityToAdd) {
        list.add(amenityToAdd);
    }

    public void removeAmenity(Amenity amenityToRemove) {
        list.remove(amenityToRemove);
    }


    @Override
    public String toString() {
        return "Catalog{" +
                "list=" + list +
                '}';
    }

    static void main(String[] args) {
    }
}
