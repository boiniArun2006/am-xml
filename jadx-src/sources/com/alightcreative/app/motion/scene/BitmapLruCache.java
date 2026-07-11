package com.alightcreative.app.motion.scene;

import android.graphics.Bitmap;
import android.graphics.Trmy.yioUaKMByL;
import android.util.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z8.AbstractC2487Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u001d\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00018\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0002\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "KEY", "Landroid/util/LruCache;", "Landroid/graphics/Bitmap;", "maxSize", "", "tag", "", "<init>", "(ILjava/lang/String;)V", "getTag", "()Ljava/lang/String;", "sizeOf", "key", "value", "(Ljava/lang/Object;Landroid/graphics/Bitmap;)I", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BitmapLruCache<KEY> extends LruCache<KEY, Bitmap> {
    public static final int $stable = 0;
    private final String tag;

    /* JADX WARN: Multi-variable type inference failed */
    public BitmapLruCache() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BitmapLruCache(int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? AbstractC2487Wre.gh() > ((long) 4) * ImageCacheKt.GB ? 629145600 : AbstractC2487Wre.gh() > ((long) 3) * ImageCacheKt.GB ? 471859200 : AbstractC2487Wre.gh() > ((long) 2) * ImageCacheKt.GB ? 314572800 : AbstractC2487Wre.gh() > ImageCacheKt.GB ? 157286400 : 78643200 : i2, (i3 & 2) != 0 ? null : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, yioUaKMByL.gwbHAYUDgcMCV);
        return weakReference.get() == null;
    }

    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.util.LruCache
    public int sizeOf(KEY key, Bitmap value) {
        if (value != null) {
            return value.getAllocationByteCount();
        }
        return 0;
    }

    public BitmapLruCache(int i2, String str) {
        super(i2);
        this.tag = str;
        ImageCacheKt.bitmapCaches.add(new WeakReference(this));
        CollectionsKt.removeAll(ImageCacheKt.bitmapCaches, new Function1() { // from class: com.alightcreative.app.motion.scene.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BitmapLruCache._init_$lambda$0((WeakReference) obj));
            }
        });
    }
}
