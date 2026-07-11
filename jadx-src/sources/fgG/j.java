package fgG;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.alightcreative.room.AlightDatabase;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f66976n = new j();

    public final AlightDatabase n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        RoomDatabase.Builder builderN = Room.n(context, AlightDatabase.class, "alight_motion_database.db");
        Fb.j[] jVarArrN = K1.j.n();
        return (AlightDatabase) builderN.rl((Migration[]) Arrays.copyOf(jVarArrN, jVarArrN.length)).nr();
    }

    public final f2.j rl(AlightDatabase alightDatabase) {
        Intrinsics.checkNotNullParameter(alightDatabase, "alightDatabase");
        return alightDatabase.p5();
    }

    private j() {
    }
}
