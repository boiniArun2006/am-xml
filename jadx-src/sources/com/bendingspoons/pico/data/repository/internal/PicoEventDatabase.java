package com.bendingspoons.pico.data.repository.internal;

import DV.j;
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@TypeConverters
@Database
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bendingspoons/pico/data/repository/internal/PicoEventDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "LDV/j;", "p5", "()LDV/j;", "ck", "j", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PicoEventDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.bendingspoons.pico.data.repository.internal.PicoEventDatabase$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PicoEventDatabase n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (PicoEventDatabase) Room.n(context, PicoEventDatabase.class, "pico_database").O().nr();
        }
    }

    public abstract j p5();
}
