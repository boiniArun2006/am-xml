package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@UnstableApi
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final t1.UGc DEFAULT_EXECUTOR_SERVICE = t1.Q.n(new t1.UGc() { // from class: androidx.media3.datasource.Ml
        @Override // t1.UGc
        public final Object get() {
            return com.google.common.util.concurrent.QJ.rl(Executors.newSingleThreadExecutor());
        }
    });
    private final DataSource.Factory dataSourceFactory;
    private final com.google.common.util.concurrent.z listeningExecutorService;
    private final int maximumOutputDimension;

    @Nullable
    private final BitmapFactory.Options options;

    public DataSourceBitmapLoader(Context context) {
        this((com.google.common.util.concurrent.z) Assertions.checkStateNotNull((com.google.common.util.concurrent.z) DEFAULT_EXECUTOR_SERVICE.get()), new DefaultDataSource.Factory(context));
    }

    public DataSourceBitmapLoader(com.google.common.util.concurrent.z zVar, DataSource.Factory factory) {
        this(zVar, factory, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap load(DataSource dataSource, Uri uri, @Nullable BitmapFactory.Options options, int i2) throws IOException {
        try {
            dataSource.open(new DataSpec(uri));
            byte[] toEnd = DataSourceUtil.readToEnd(dataSource);
            return BitmapUtil.decode(toEnd, toEnd.length, options, i2);
        } finally {
            dataSource.close();
        }
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.Xo decodeBitmap(final byte[] bArr) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.I28
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DataSourceBitmapLoader.n(this.f39350n, bArr);
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.Xo loadBitmap(final Uri uri) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.Wre
            @Override // java.util.concurrent.Callable
            public final Object call() {
                DataSourceBitmapLoader dataSourceBitmapLoader = this.f39351n;
                return DataSourceBitmapLoader.load(dataSourceBitmapLoader.dataSourceFactory.createDataSource(), uri, dataSourceBitmapLoader.options, dataSourceBitmapLoader.maximumOutputDimension);
            }
        });
    }

    public DataSourceBitmapLoader(com.google.common.util.concurrent.z zVar, DataSource.Factory factory, @Nullable BitmapFactory.Options options) {
        this(zVar, factory, options, -1);
    }

    public static /* synthetic */ Bitmap n(DataSourceBitmapLoader dataSourceBitmapLoader, byte[] bArr) {
        dataSourceBitmapLoader.getClass();
        return BitmapUtil.decode(bArr, bArr.length, dataSourceBitmapLoader.options, dataSourceBitmapLoader.maximumOutputDimension);
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }

    public DataSourceBitmapLoader(com.google.common.util.concurrent.z zVar, DataSource.Factory factory, @Nullable BitmapFactory.Options options, int i2) {
        this.listeningExecutorService = zVar;
        this.dataSourceFactory = factory;
        this.options = options;
        this.maximumOutputDimension = i2;
    }
}
