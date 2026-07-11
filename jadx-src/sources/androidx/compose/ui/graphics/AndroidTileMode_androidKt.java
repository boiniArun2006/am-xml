package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.TileMode;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/TileMode;", "Landroid/graphics/Shader$TileMode;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(I)Landroid/graphics/Shader$TileMode;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidTileMode_androidKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Shader.TileMode n(int i2) {
        TileMode.Companion companion = TileMode.INSTANCE;
        return TileMode.Uo(i2, companion.n()) ? Shader.TileMode.CLAMP : TileMode.Uo(i2, companion.nr()) ? Shader.TileMode.REPEAT : TileMode.Uo(i2, companion.t()) ? Shader.TileMode.MIRROR : TileMode.Uo(i2, companion.rl()) ? Build.VERSION.SDK_INT >= 31 ? TileModeVerificationHelper.f31583n.n() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }
}
