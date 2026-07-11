package com.bendingspoons.picox.persistence.internal;

import Hr.CQ.USEaHtCMH;
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import zL.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@TypeConverters
@Database
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bendingspoons/picox/persistence/internal/PicoXEventDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "LzL/j;", "p5", "()LzL/j;", "ck", "j", "picox_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PicoXEventDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.bendingspoons.picox.persistence.internal.PicoXEventDatabase$j, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PicoXEventDatabase n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (PicoXEventDatabase) Room.n(context, PicoXEventDatabase.class, USEaHtCMH.drcpmoBoOIX).O().nr();
        }
    }

    public abstract j p5();
}
