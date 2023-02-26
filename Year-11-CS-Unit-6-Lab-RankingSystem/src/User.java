public class User {
    private int rank;
    private int progress;

    public User() {
        this.rank = -8;
        this.progress = 0;
    }

    public int getRank() {
        return rank;
    }

    public int getProgress() {
        return progress;
    }

    public void setRank(int rank) {
        if (rank < -8 || rank > 8 || rank == 0)
            throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");
        this.rank = rank;
    }


    public String toString() {
        return ("User{rank=" + rank + ", progress=" + progress + "}");
    }

    public void incProgress(int activityRank) {
        if (activityRank < -8 || activityRank > 8 || activityRank == 0)
            throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");

        int progressDiff = activityRank - rank;

        if (rank == activityRank) {
            progress = progress + 3;
        }
        if (rank == 1){
            progress = progress + 1;
        }
        if (progressDiff <= 2) {
            progress = (10 * progressDiff * progressDiff) + progress;
        }
        if (rank == 8)
            progress = 0;
    }

}

