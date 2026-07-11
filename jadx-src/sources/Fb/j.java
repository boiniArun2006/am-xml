package Fb;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j extends Migration {
    public j() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public void rl(SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.ck("CREATE TABLE IF NOT EXISTS `_new_unlock_feature` (`projectId` TEXT NOT NULL, `featureId` TEXT NOT NULL, `expirationMillis` INTEGER NOT NULL, PRIMARY KEY(`projectId`, `featureId`))");
        db.ck("INSERT INTO `_new_unlock_feature`(`projectId`, `featureId`, `expirationMillis`) SELECT `projectId`, `featureId`, `uplockedAtMillis` + 604800000 FROM `unlock_feature`");
        db.ck("DROP TABLE `unlock_feature`");
        db.ck("ALTER TABLE `_new_unlock_feature` RENAME TO `unlock_feature`");
    }
}
