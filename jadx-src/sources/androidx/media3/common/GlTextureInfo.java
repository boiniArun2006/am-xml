package androidx.media3.common;

import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@UnstableApi
public final class GlTextureInfo {
    public static final GlTextureInfo UNSET = new GlTextureInfo(-1, -1, -1, -1, -1);
    public final int fboId;
    public final int height;
    public final int rboId;
    public final int texId;
    public final int width;

    public void release() throws GlUtil.GlException {
        int i2 = this.texId;
        if (i2 != -1) {
            GlUtil.deleteTexture(i2);
        }
        int i3 = this.fboId;
        if (i3 != -1) {
            GlUtil.deleteFbo(i3);
        }
        int i5 = this.rboId;
        if (i5 != -1) {
            GlUtil.deleteRbo(i5);
        }
    }

    public GlTextureInfo(int i2, int i3, int i5, int i7, int i8) {
        this.texId = i2;
        this.fboId = i3;
        this.rboId = i5;
        this.width = i7;
        this.height = i8;
    }
}
