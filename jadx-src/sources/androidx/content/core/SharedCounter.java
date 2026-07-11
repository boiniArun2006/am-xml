package androidx.content.core;

import android.os.ParcelFileDescriptor;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/datastore/core/SharedCounter;", "", "", "mappedAddress", "<init>", "(J)V", "", "rl", "()I", "t", c.f62177j, "J", "Factory", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedCounter {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final NativeSharedCounter f37584t = new NativeSharedCounter();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long mappedAddress;

    /* JADX INFO: renamed from: androidx.datastore.core.SharedCounter$Factory, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u001d\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/datastore/core/SharedCounter$Factory;", "", "<init>", "()V", "Landroid/os/ParcelFileDescriptor;", "pfd", "Landroidx/datastore/core/SharedCounter;", "rl", "(Landroid/os/ParcelFileDescriptor;)Landroidx/datastore/core/SharedCounter;", "", "nr", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", c.f62177j, "(Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/SharedCounter;", "Landroidx/datastore/core/NativeSharedCounter;", "nativeSharedCounter", "Landroidx/datastore/core/NativeSharedCounter;", "t", "()Landroidx/datastore/core/NativeSharedCounter;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SharedCounter n(Function0 produceFile) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            Intrinsics.checkNotNullParameter(produceFile, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) produceFile.invoke(), 939524096);
                try {
                    SharedCounter sharedCounterRl = rl(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return sharedCounterRl;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptorOpen = null;
            }
        }

        public final void nr() {
            System.loadLibrary("datastore_shared_counter");
        }

        private final SharedCounter rl(ParcelFileDescriptor pfd) throws IOException {
            int fd = pfd.getFd();
            if (t().nativeTruncateFile(fd) == 0) {
                long jNativeCreateSharedCounter = t().nativeCreateSharedCounter(fd);
                if (jNativeCreateSharedCounter >= 0) {
                    return new SharedCounter(jNativeCreateSharedCounter, null);
                }
                throw new IOException("Failed to mmap counter file");
            }
            throw new IOException("Failed to truncate counter file");
        }

        public final NativeSharedCounter t() {
            return SharedCounter.f37584t;
        }
    }

    public /* synthetic */ SharedCounter(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    private SharedCounter(long j2) {
        this.mappedAddress = j2;
    }

    public final int rl() {
        return f37584t.nativeGetCounterValue(this.mappedAddress);
    }

    public final int t() {
        return f37584t.nativeIncrementAndGetCounterValue(this.mappedAddress);
    }
}
