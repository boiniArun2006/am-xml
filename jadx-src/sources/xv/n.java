package xv;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.source.BundledExtractorsAdapter;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n implements PjV.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f75506n;
    private final Function0 rl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f75507n = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final DefaultDataSource invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            DefaultDataSource defaultDataSourceCreateDataSource = new DefaultDataSource.Factory(it).createDataSource();
            Intrinsics.checkNotNullExpressionValue(defaultDataSourceCreateDataSource, "Factory(it).createDataSource()");
            return defaultDataSourceCreateDataSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: xv.n$n, reason: collision with other inner class name */
    public static final class C1278n extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1278n f75508n = new C1278n();

        C1278n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final BundledExtractorsAdapter invoke() {
            return new BundledExtractorsAdapter(new DefaultExtractorsFactory().setConstantBitrateSeekingAlwaysEnabled(true));
        }
    }

    public n(Function1 dataSourceFactory, Function0 extractorFactory) {
        Intrinsics.checkNotNullParameter(dataSourceFactory, "dataSourceFactory");
        Intrinsics.checkNotNullParameter(extractorFactory, "extractorFactory");
        this.f75506n = dataSourceFactory;
        this.rl = extractorFactory;
    }

    @Override // PjV.n
    public CSs.n n(Context context, Uri uri, ExtractorOutput extractorOutput) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(extractorOutput, "extractorOutput");
        return new CC.n((ProgressiveMediaExtractor) this.rl.invoke(), (DataSource) this.f75506n.invoke(context), uri, extractorOutput);
    }

    public /* synthetic */ n(Function1 function1, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? j.f75507n : function1, (i2 & 2) != 0 ? C1278n.f75508n : function0);
    }
}
