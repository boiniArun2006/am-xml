package six;

import HI0.afx;
import HI0.qz;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import androidx.compose.runtime.MutableState;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SceneType.values().length];
            try {
                iArr[SceneType.SCENE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SceneType.ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SceneType.PRESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(BitmapLruCache bitmapLruCache, ProjectInfo projectInfo, MutableState mutableState, Bitmap bitmap) {
        if (bitmap == null) {
            FirebaseCrashlytics.getInstance().recordException(new NullPointerException("Bitmap null"));
        } else {
            bitmapLruCache.put(projectInfo, bitmap);
            mutableState.setValue(bitmap);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap nr(File file, ProjectInfo projectInfo, Context context, SceneThumbnailMaker sceneThumbnailMaker) {
        Bitmap bitmapDecodeStream;
        file.mkdirs();
        File fileResolve = FilesKt.resolve(file, projectInfo.getId() + "_" + projectInfo.getLastModified() + "." + (projectInfo.getType() == SceneType.ELEMENT ? "png" : "jpg"));
        if (fileResolve.exists()) {
            FileInputStream fileInputStream = new FileInputStream(fileResolve);
            try {
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(fileInputStream);
                CloseableKt.closeFinally(fileInputStream, null);
                return bitmapDecodeStream2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileInputStream, th);
                    throw th2;
                }
            }
        }
        try {
            if (projectInfo instanceof ProjectInfo.n) {
                Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(afx.o(context, ((ProjectInfo.n) projectInfo).getId()), null, 1, null), false, false, false, 14, null);
                bitmapDecodeStream = SceneThumbnailMaker.makeThumbnail$default(sceneThumbnailMaker, sceneUnserializeScene$default, null, Integer.valueOf(SceneKt.getThumbTime(sceneUnserializeScene$default)), true, 2, null);
            } else {
                if (!(projectInfo instanceof ProjectInfo.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                bitmapDecodeStream = BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream(new URL(((ProjectInfo.j) projectInfo).n())));
                Intrinsics.checkNotNull(bitmapDecodeStream);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(fileResolve);
            try {
                int i2 = j.$EnumSwitchMapping$0[projectInfo.getType().ordinal()];
                if (i2 == 1) {
                    bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                } else if (i2 == 2) {
                    bitmapDecodeStream.compress(Bitmap.CompressFormat.PNG, 80, fileOutputStream);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                return bitmapDecodeStream;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(fileOutputStream, th3);
                    throw th4;
                }
            }
        } catch (MalformedSceneException unused) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawColor(-65536);
            return bitmapCreateBitmap;
        } catch (Exception unused2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(...)");
            new Canvas(bitmapCreateBitmap2).drawColor(context.getColor(2131099661));
            return bitmapCreateBitmap2;
        }
    }

    public static final void t(final Context context, final ProjectInfo projectInfo, final MutableState thumbnailBitmap, final BitmapLruCache thumbnailCache, final SceneThumbnailMaker thumbnailMaker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(projectInfo, "projectInfo");
        Intrinsics.checkNotNullParameter(thumbnailBitmap, "thumbnailBitmap");
        Intrinsics.checkNotNullParameter(thumbnailCache, "thumbnailCache");
        Intrinsics.checkNotNullParameter(thumbnailMaker, "thumbnailMaker");
        thumbnailBitmap.setValue(null);
        Bitmap bitmap = thumbnailCache.get(projectInfo);
        if (bitmap != null) {
            thumbnailBitmap.setValue(bitmap);
            return;
        }
        thumbnailBitmap.setValue(null);
        File cacheDir = IvA.n.rl().getApplicationContext().getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        final File fileResolve = FilesKt.resolve(cacheDir, "project_thumbs");
        qz.nr(null, new Function0() { // from class: six.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.nr(fileResolve, projectInfo, context, thumbnailMaker);
            }
        }, 1, null).Uo(new Function1() { // from class: six.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w6.O(thumbnailCache, projectInfo, thumbnailBitmap, (Bitmap) obj);
            }
        });
    }
}
