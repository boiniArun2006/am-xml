package androidx.room;

import androidx.room.migration.Migration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a>\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000e\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"R", "Landroidx/room/RoomDatabase;", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "block", c.f62177j, "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "migrationStartAndEndVersions", "migrationsNotRequiredFrom", "", "t", "(Ljava/util/Set;Ljava/util/Set;)V", "Landroidx/room/DatabaseConfiguration;", com.safedk.android.utils.j.f63190c, "rl", "(Landroidx/room/RoomDatabase;Landroidx/room/DatabaseConfiguration;)V", "nr", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
@SourceDebugExtension({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabaseKt__RoomDatabaseKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,596:1\n1#2:597\n216#3,2:598\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabaseKt__RoomDatabaseKt\n*L\n565#1:598,2\n*E\n"})
final /* synthetic */ class RoomDatabaseKt__RoomDatabaseKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(RoomDatabase roomDatabase, Function2 function2, Continuation continuation) {
        RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;
        if (continuation instanceof RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1) {
            roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 = (RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1) continuation;
            int i2 = roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.f41397O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.f41397O = i2 - Integer.MIN_VALUE;
            } else {
                roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 = new RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1(continuation);
            }
        }
        Object objUo = roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.f41399t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.f41397O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            CoroutineContext coroutineContext = roomDatabase.S().getCoroutineContext();
            RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 roomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 = new RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2(roomDatabase, function2, null);
            roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.f41398n = roomDatabase;
            roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.f41397O = 1;
            objUo = GJW.Dsr.Uo(coroutineContext, roomDatabaseKt__RoomDatabaseKt$useWriterConnection$2, roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            roomDatabase = (RoomDatabase) roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.f41398n;
            ResultKt.throwOnFailure(objUo);
        }
        roomDatabase.WPU().aYN();
        return objUo;
    }

    public static final void nr(RoomDatabase roomDatabase, DatabaseConfiguration configuration) {
        Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Map mapIF = roomDatabase.iF();
        boolean[] zArr = new boolean[configuration.typeConverters.size()];
        for (Map.Entry entry : mapIF.entrySet()) {
            KClass kClass = (KClass) entry.getKey();
            for (KClass kClass2 : (List) entry.getValue()) {
                int size = configuration.typeConverters.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (kClass2.isInstance(configuration.typeConverters.get(size))) {
                            zArr[size] = true;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                    size = -1;
                } else {
                    size = -1;
                }
                if (size < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + kClass2.getQualifiedName() + ") for " + kClass.getQualifiedName() + " is missing in the database configuration.").toString());
                }
                roomDatabase.J2(kClass2, configuration.typeConverters.get(size));
            }
        }
        int size2 = configuration.typeConverters.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i3 = size2 - 1;
            if (!zArr[size2]) {
                throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
            if (i3 < 0) {
                return;
            } else {
                size2 = i3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(RoomDatabase roomDatabase, DatabaseConfiguration configuration) {
        Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set setNY = roomDatabase.nY();
        int size = configuration.autoMigrationSpecs.size();
        boolean[] zArr = new boolean[size];
        Iterator it = setNY.iterator();
        while (true) {
            int i2 = -1;
            if (!it.hasNext()) {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (size2 >= size || !zArr[size2]) {
                            break;
                        } else if (i3 < 0) {
                            break;
                        } else {
                            size2 = i3;
                        }
                    }
                }
                for (Migration migration : roomDatabase.qie(linkedHashMap)) {
                    if (!configuration.migrationContainer.t(migration.startVersion, migration.endVersion)) {
                        configuration.migrationContainer.n(migration);
                    }
                }
                return;
            }
            KClass kClass = (KClass) it.next();
            int size3 = configuration.autoMigrationSpecs.size() - 1;
            if (size3 >= 0) {
                while (true) {
                    int i5 = size3 - 1;
                    if (kClass.isInstance(configuration.autoMigrationSpecs.get(size3))) {
                        zArr[size3] = true;
                        i2 = size3;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        size3 = i5;
                    }
                }
            }
            if (i2 < 0) {
                throw new IllegalArgumentException(("A required auto migration spec (" + kClass.getQualifiedName() + ") is missing in the database configuration.").toString());
            }
            linkedHashMap.put(kClass, configuration.autoMigrationSpecs.get(i2));
        }
    }

    public static final void t(Set migrationStartAndEndVersions, Set migrationsNotRequiredFrom) {
        Intrinsics.checkNotNullParameter(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        Intrinsics.checkNotNullParameter(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (migrationStartAndEndVersions.isEmpty()) {
            return;
        }
        Iterator it = migrationStartAndEndVersions.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: " + iIntValue).toString());
            }
        }
    }
}
