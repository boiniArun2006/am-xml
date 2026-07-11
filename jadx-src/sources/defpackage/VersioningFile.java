package defpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import d8q.j;
import defpackage.VersioningFile;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qcD.nehv.Apsps;
import x0X.n;
import x0X.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0001#B!\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0013¨\u0006$"}, d2 = {"LVersioningFile;", "", "", "LFreeze;", "freezeVersions", "LLatestVersion;", "latestVersion", "<init>", "(Ljava/util/List;LLatestVersion;)V", "", "nativeBuildNumber", "Lkotlin/Pair;", "Ljava/net/URL;", "", "getWebAppUrlAndSignature", "(I)Lkotlin/Pair;", "component1", "()Ljava/util/List;", "component2", "()LLatestVersion;", "copy", "(Ljava/util/List;LLatestVersion;)LVersioningFile;", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFreezeVersions", "LLatestVersion;", "getLatestVersion", "Companion", "j", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVersioningFIle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VersioningFIle.kt\nVersioningFile\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n774#2:100\n865#2,2:101\n2341#2,14:103\n*S KotlinDebug\n*F\n+ 1 VersioningFIle.kt\nVersioningFile\n*L\n27#1:100\n27#1:101,2\n28#1:103,14\n*E\n"})
public final /* data */ class VersioningFile {
    private static final JsonAdapter<VersioningFile> adapter;
    private static final Moshi moshi;
    private final List<Freeze> freezeVersions;
    private final LatestVersion latestVersion;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: VersioningFile$j, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String O() {
            return "Empty versioning file";
        }

        public final n t(final String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            n nVarN = w6.n(new Function0() { // from class: j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VersioningFile.Companion.nr(json);
                }
            });
            if (!(nVarN instanceof n.C1266n)) {
                if (!(nVarN instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVarN = n.f75185n.rl((VersioningFile) ((n.w6) nVarN).n(), new Function0() { // from class: n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return VersioningFile.Companion.O();
                    }
                });
            }
            if (!(nVarN instanceof n.C1266n)) {
                if (nVarN instanceof n.w6) {
                    return nVarN;
                }
                throw new NoWhenBranchMatchedException();
            }
            return new n.C1266n(new j.w6(new Error("Invalid format versioning file: " + ((Throwable) ((n.C1266n) nVarN).n()).getMessage())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VersioningFile nr(String str) {
            return (VersioningFile) VersioningFile.adapter.fromJson(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VersioningFile copy$default(VersioningFile versioningFile, List list, LatestVersion latestVersion, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = versioningFile.freezeVersions;
        }
        if ((i2 & 2) != 0) {
            latestVersion = versioningFile.latestVersion;
        }
        return versioningFile.copy(list, latestVersion);
    }

    public final List<Freeze> component1() {
        return this.freezeVersions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LatestVersion getLatestVersion() {
        return this.latestVersion;
    }

    public final VersioningFile copy(@Json(name = "freezes") List<Freeze> freezeVersions, @Json(name = "latest") LatestVersion latestVersion) {
        Intrinsics.checkNotNullParameter(freezeVersions, "freezeVersions");
        Intrinsics.checkNotNullParameter(latestVersion, "latestVersion");
        return new VersioningFile(freezeVersions, latestVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersioningFile)) {
            return false;
        }
        VersioningFile versioningFile = (VersioningFile) other;
        return Intrinsics.areEqual(this.freezeVersions, versioningFile.freezeVersions) && Intrinsics.areEqual(this.latestVersion, versioningFile.latestVersion);
    }

    public int hashCode() {
        return (this.freezeVersions.hashCode() * 31) + this.latestVersion.hashCode();
    }

    public String toString() {
        return "VersioningFile(freezeVersions=" + this.freezeVersions + ", latestVersion=" + this.latestVersion + ")";
    }

    static {
        Moshi moshiBuild = new Moshi.Builder().add(new LatestVersionJsonAdapter()).add((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        moshi = moshiBuild;
        JsonAdapter<VersioningFile> jsonAdapterAdapter = moshiBuild.adapter(VersioningFile.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        adapter = jsonAdapterAdapter;
    }

    public VersioningFile(@Json(name = "freezes") List<Freeze> list, @Json(name = "latest") LatestVersion latestVersion) {
        Intrinsics.checkNotNullParameter(list, Apsps.dvJbmo);
        Intrinsics.checkNotNullParameter(latestVersion, "latestVersion");
        this.freezeVersions = list;
        this.latestVersion = latestVersion;
    }

    public final List<Freeze> getFreezeVersions() {
        return this.freezeVersions;
    }

    public final LatestVersion getLatestVersion() {
        return this.latestVersion;
    }

    public final Pair<URL, String> getWebAppUrlAndSignature(int nativeBuildNumber) {
        Object obj;
        List<Freeze> list = this.freezeVersions;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Freeze) obj2).getNativeBuildNumber() >= nativeBuildNumber) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int nativeBuildNumber2 = ((Freeze) next).getNativeBuildNumber();
                do {
                    Object next2 = it.next();
                    int nativeBuildNumber3 = ((Freeze) next2).getNativeBuildNumber();
                    if (nativeBuildNumber2 > nativeBuildNumber3) {
                        next = next2;
                        nativeBuildNumber2 = nativeBuildNumber3;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Freeze freeze = (Freeze) obj;
        return freeze != null ? TuplesKt.to(new URL(freeze.getWebAppUrl()), freeze.getSignature()) : TuplesKt.to(new URL(this.latestVersion.getWebAppUrl()), this.latestVersion.getSignature());
    }
}
