package db;

import android.provider.BaseColumns;

/**
 * Created by אילון on 29/11/2016.
 */

public final class FeedReaderContract {
    public static final String CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS " + FeedScore.TABLE_NAME +
             " (" + FeedScore.COLUMN_NAME_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    FeedScore.COLUMN_NAME_PLAYER_NAME + " TEXT, "+
                    FeedScore.COLUMN_NAME_LEVEL       + " INTEGER,"+
                    FeedScore.COLUMN_NAME_SCORE + " INTEGER"+
                     ")";

    public static final String DELETE_SCORE_TABLE = "DROP TABLE IF EXISTS "+ FeedScore.TABLE_NAME;

    private FeedReaderContract(){}

    public static class FeedScore implements BaseColumns{
        public static final String TABLE_NAME              = "MineSweeperScores";
        public static final String COLUMN_NAME_ID          = "Player_ID";
        public static final String COLUMN_NAME_PLAYER_NAME = "Player_name";
        public static final String COLUMN_NAME_LEVEL       = "Level";
        public static final String COLUMN_NAME_SCORE       = "Score";
    }
}
