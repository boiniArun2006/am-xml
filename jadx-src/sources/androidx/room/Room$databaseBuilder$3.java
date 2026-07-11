package androidx.room;

import androidx.room.util.KClassUtil;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class Room$databaseBuilder$3 implements Function0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Room$databaseBuilder$3 f41359n;

    static {
        Intrinsics.needClassReification();
        f41359n = new Room$databaseBuilder$3();
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final RoomDatabase invoke() {
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (RoomDatabase) KClassUtil.rl(RoomDatabase.class, null, 2, null);
    }
}
