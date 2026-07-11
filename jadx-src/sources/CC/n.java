package CC;

import LQ.j;
import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import uPp.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements CSs.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j f828g = new j(null);
    private final ExtractorOutput J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Uri f829O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private SeekPoint f830S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final PositionHolder f831Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ProgressiveMediaExtractor f832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f833o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f834r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DataSource f835t;

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public n(ProgressiveMediaExtractor extractor, DataSource dataSource, Uri uri, ExtractorOutput extractorOutput) {
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(extractorOutput, "extractorOutput");
        this.f832n = extractor;
        this.f835t = dataSource;
        this.f829O = uri;
        this.J2 = extractorOutput;
        this.f833o = true;
        this.f831Z = new PositionHolder();
    }

    private final boolean gh() throws IOException {
        SeekPoint seekPoint = this.f830S;
        if (this.f833o) {
            if (this.f834r) {
                this.f835t.close();
                this.f834r = false;
            }
            if (seekPoint != null) {
                this.f831Z.position = seekPoint.position;
            }
            DataSpec dataSpecRl = w6.rl(this.f829O, this.f831Z.position);
            this.f834r = true;
            long jOpen = this.f835t.open(dataSpecRl);
            this.f832n.init(this.f835t, this.f829O, MapsKt.emptyMap(), this.f831Z.position, jOpen != -1 ? this.f831Z.position + jOpen : -1L, this.J2);
            if (seekPoint != null) {
                this.f832n.seek(seekPoint.position, seekPoint.timeUs);
            }
            this.f830S = null;
            this.f833o = false;
        }
        int i2 = this.f832n.read(this.f831Z);
        if (i2 == -1) {
            this.f831Z.position = this.f832n.getCurrentInputPosition();
            return false;
        }
        if (i2 == 0) {
            this.f831Z.position = this.f832n.getCurrentInputPosition();
            return true;
        }
        if (i2 == 1) {
            this.f833o = true;
            return true;
        }
        throw new IllegalStateException("Unexpected extractor result: " + i2);
    }

    @Override // CSs.n
    public void n(SeekPoint point) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.f830S = point;
        this.f833o = true;
    }

    @Override // CSs.n
    public LQ.j read() {
        try {
            return new j.w6(Boolean.valueOf(gh()));
        } catch (ParserException e2) {
            return new j.n(new I28.w6(e2));
        } catch (FileNotFoundException e3) {
            return new j.n(new I28.j(e3));
        } catch (IOException e4) {
            return new j.n(new I28.n(e4));
        } catch (SecurityException e5) {
            return new j.n(new I28.Ml(e5));
        } catch (Exception e6) {
            return new j.n(new I28.C1226I28(e6));
        }
    }

    @Override // w9.fuX
    public void release() throws IOException {
        this.f832n.release();
        if (this.f834r) {
            this.f835t.close();
        }
    }
}
