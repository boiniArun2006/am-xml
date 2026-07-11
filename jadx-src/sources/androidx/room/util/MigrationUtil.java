package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.DatabaseConfiguration;
import androidx.room.RoomDatabase;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aA\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/room/DatabaseConfiguration;", "", "fromVersion", "toVersion", "", "nr", "(Landroidx/room/DatabaseConfiguration;II)Z", "Landroidx/room/RoomDatabase$MigrationContainer;", "startVersion", "endVersion", c.f62177j, "(Landroidx/room/RoomDatabase$MigrationContainer;II)Z", TtmlNode.START, TtmlNode.END, "", "Landroidx/room/migration/Migration;", "rl", "(Landroidx/room/RoomDatabase$MigrationContainer;II)Ljava/util/List;", "", "result", "upgrade", "t", "(Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZII)Ljava/util/List;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@RestrictTo
@JvmName(name = "MigrationUtil")
public final class MigrationUtil {
    public static final boolean n(RoomDatabase.MigrationContainer migrationContainer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(migrationContainer, "<this>");
        Map migrations = migrationContainer.getMigrations();
        if (!migrations.containsKey(Integer.valueOf(i2))) {
            return false;
        }
        Map mapEmptyMap = (Map) migrations.get(Integer.valueOf(i2));
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return mapEmptyMap.containsKey(Integer.valueOf(i3));
    }

    public static final boolean nr(DatabaseConfiguration databaseConfiguration, int i2, int i3) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "<this>");
        if (i2 > i3 && databaseConfiguration.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set migrationNotRequiredFrom = databaseConfiguration.getMigrationNotRequiredFrom();
        return databaseConfiguration.requireMigration && (migrationNotRequiredFrom == null || !migrationNotRequiredFrom.contains(Integer.valueOf(i2)));
    }

    public static final List rl(RoomDatabase.MigrationContainer migrationContainer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(migrationContainer, "<this>");
        if (i2 == i3) {
            return CollectionsKt.emptyList();
        }
        return t(migrationContainer, new ArrayList(), i3 > i2, i2, i3);
    }

    private static final List t(RoomDatabase.MigrationContainer migrationContainer, List list, boolean z2, int i2, int i3) {
        int iIntValue;
        boolean z3;
        while (true) {
            if (z2) {
                if (i2 >= i3) {
                    return list;
                }
            } else if (i2 <= i3) {
                return list;
            }
            Pair pairJ2 = z2 ? migrationContainer.J2(i2) : migrationContainer.Uo(i2);
            if (pairJ2 == null) {
                return null;
            }
            Map map = (Map) pairJ2.component1();
            Iterator it = ((Iterable) pairJ2.component2()).iterator();
            while (it.hasNext()) {
                iIntValue = ((Number) it.next()).intValue();
                if (!z2) {
                    if (i3 <= iIntValue && iIntValue < i2) {
                        Object obj = map.get(Integer.valueOf(iIntValue));
                        Intrinsics.checkNotNull(obj);
                        list.add(obj);
                        z3 = true;
                        break;
                    }
                } else if (i2 + 1 <= iIntValue && iIntValue <= i3) {
                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                    Intrinsics.checkNotNull(obj2);
                    list.add(obj2);
                    z3 = true;
                    break;
                }
            }
            iIntValue = i2;
            z3 = false;
            if (!z3) {
                return null;
            }
            i2 = iIntValue;
        }
    }
}
