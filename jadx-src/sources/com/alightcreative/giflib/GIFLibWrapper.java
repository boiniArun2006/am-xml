package com.alightcreative.giflib;

import com.caoccao.javet.exceptions.JavetError;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0086 J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0086 J\u0019\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\tH\u0086 ¨\u0006\u0014"}, d2 = {"Lcom/alightcreative/giflib/GIFLibWrapper;", "", "<init>", "()V", "newInstance", "", JavetError.PARAMETER_PATH, "", "width", "", "height", "loop", "quantizer", "dither", "", "freeInstance", "", "handle", "writeGLFrame", "delayTime", "giflib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GIFLibWrapper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final GIFLibWrapper f46617n = new GIFLibWrapper();

    public final native void freeInstance(long handle);

    public final native long newInstance(String path, int width, int height, int loop, int quantizer, boolean dither);

    public final native void writeGLFrame(long handle, int delayTime);

    private GIFLibWrapper() {
    }
}
