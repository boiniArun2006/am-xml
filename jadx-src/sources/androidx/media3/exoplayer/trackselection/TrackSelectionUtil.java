package androidx.media3.exoplayer.trackselection;

import android.graphics.Point;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.google.common.collect.nKK;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public final class TrackSelectionUtil {

    public interface AdaptiveTrackSelectionFactory {
        ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition);
    }

    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelection[] trackSelectionArr) {
        List[] listArr = new List[trackSelectionArr.length];
        for (int i2 = 0; i2 < trackSelectionArr.length; i2++) {
            TrackSelection trackSelection = trackSelectionArr[i2];
            listArr[i2] = trackSelection != null ? nKK.o(trackSelection) : nKK.r();
        }
        return buildTracks(mappedTrackInfo, (List<? extends TrackSelection>[]) listArr);
    }

    public static ExoTrackSelection[] createTrackSelectionsForDefinitions(ExoTrackSelection.Definition[] definitionArr, AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
        boolean z2 = false;
        for (int i2 = 0; i2 < definitionArr.length; i2++) {
            ExoTrackSelection.Definition definition = definitionArr[i2];
            if (definition != null) {
                int[] iArr = definition.tracks;
                if (iArr.length <= 1 || z2) {
                    exoTrackSelectionArr[i2] = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                } else {
                    exoTrackSelectionArr[i2] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z2 = true;
                }
            }
        }
        return exoTrackSelectionArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Point getMaxVideoSizeInViewport(boolean z2, int i2, int i3, int i5, int i7) {
        if (z2) {
            if ((i5 > i7) == (i2 > i3)) {
                i3 = i2;
                i2 = i3;
            }
        }
        int i8 = i5 * i2;
        int i9 = i7 * i3;
        return i8 >= i9 ? new Point(i3, Util.ceilDivide(i9, i5)) : new Point(Util.ceilDivide(i8, i7), i2);
    }

    private TrackSelectionUtil() {
    }

    public static LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(ExoTrackSelection exoTrackSelection) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (exoTrackSelection.isTrackExcluded(i3, jElapsedRealtime)) {
                i2++;
            }
        }
        return new LoadErrorHandlingPolicy.FallbackOptions(1, 0, length, i2);
    }

    @Deprecated
    public static DefaultTrackSelector.Parameters updateParametersWithOverride(DefaultTrackSelector.Parameters parameters, int i2, TrackGroupArray trackGroupArray, boolean z2, @Nullable DefaultTrackSelector.SelectionOverride selectionOverride) {
        DefaultTrackSelector.Parameters.Builder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i2).setRendererDisabled(i2, z2);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i2, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }

    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, List<? extends TrackSelection>[] listArr) {
        boolean z2;
        nKK.j jVar = new nKK.j();
        for (int i2 = 0; i2 < mappedTrackInfo.getRendererCount(); i2++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i2);
            List<? extends TrackSelection> list = listArr[i2];
            for (int i3 = 0; i3 < trackGroups.length; i3++) {
                TrackGroup trackGroup = trackGroups.get(i3);
                boolean z3 = mappedTrackInfo.getAdaptiveSupport(i2, i3, false) != 0;
                int i5 = trackGroup.length;
                int[] iArr = new int[i5];
                boolean[] zArr = new boolean[i5];
                for (int i7 = 0; i7 < trackGroup.length; i7++) {
                    iArr[i7] = mappedTrackInfo.getTrackSupport(i2, i3, i7);
                    int i8 = 0;
                    while (true) {
                        if (i8 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        TrackSelection trackSelection = list.get(i8);
                        if (trackSelection.getTrackGroup().equals(trackGroup) && trackSelection.indexOf(i7) != -1) {
                            z2 = true;
                            break;
                        }
                        i8++;
                    }
                    zArr[i7] = z2;
                }
                jVar.n(new Tracks.Group(trackGroup, z3, iArr, zArr));
            }
        }
        TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i9 = 0; i9 < unmappedTrackGroups.length; i9++) {
            TrackGroup trackGroup2 = unmappedTrackGroups.get(i9);
            int[] iArr2 = new int[trackGroup2.length];
            Arrays.fill(iArr2, 0);
            jVar.n(new Tracks.Group(trackGroup2, false, iArr2, new boolean[trackGroup2.length]));
        }
        return new Tracks(jVar.gh());
    }
}
