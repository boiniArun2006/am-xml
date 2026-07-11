package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfuk {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final HashSet zzh = new HashSet();
    private final Map zzi = new WeakHashMap();
    private boolean zzj;

    public final HashSet zza() {
        return this.zze;
    }

    public final HashSet zzb() {
        return this.zzf;
    }

    public final void zzf() {
        this.zzj = true;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final void zze() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
        this.zzh.clear();
    }

    public final String zzg(View view) {
        HashMap map = this.zza;
        if (map.size() == 0) {
            return null;
        }
        String str = (String) map.get(view);
        if (str != null) {
            map.remove(view);
        }
        return str;
    }

    public final View zzh(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfuj zzi(View view) {
        HashMap map = this.zzb;
        zzfuj zzfujVar = (zzfuj) map.get(view);
        if (zzfujVar != null) {
            map.remove(view);
        }
        return zzfujVar;
    }

    public final boolean zzj(View view) {
        Map map = this.zzi;
        if (!map.containsKey(view)) {
            return true;
        }
        map.put(view, Boolean.TRUE);
        return false;
    }

    public final boolean zzk(String str) {
        return this.zzh.contains(str);
    }

    public final int zzl(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzj ? 2 : 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd() {
        String str;
        Activity activity;
        boolean zIsInPictureInPictureMode;
        Boolean bool;
        zzfth zzfthVarZza = zzfth.zza();
        if (zzfthVarZza != null) {
            for (zzfsn zzfsnVar : zzfthVarZza.zzf()) {
                View viewZzi = zzfsnVar.zzi();
                if (zzfsnVar.zzj()) {
                    String strZzh = zzfsnVar.zzh();
                    if (viewZzi != null) {
                        Context context = viewZzi.getContext();
                        while (true) {
                            str = null;
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                activity = null;
                                break;
                            }
                        }
                        if (activity != null) {
                            zIsInPictureInPictureMode = activity.isInPictureInPictureMode();
                        } else {
                            zIsInPictureInPictureMode = false;
                        }
                        if (zIsInPictureInPictureMode) {
                            this.zzh.add(strZzh);
                        }
                        if (!viewZzi.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (viewZzi.hasWindowFocus()) {
                                this.zzi.remove(viewZzi);
                                bool = Boolean.FALSE;
                            } else {
                                Map map = this.zzi;
                                if (map.containsKey(viewZzi)) {
                                    bool = (Boolean) map.get(viewZzi);
                                } else {
                                    Boolean bool2 = Boolean.FALSE;
                                    map.put(viewZzi, bool2);
                                    bool = bool2;
                                }
                            }
                            if (bool.booleanValue() && !zIsInPictureInPictureMode) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = viewZzi;
                                while (true) {
                                    if (view != null) {
                                        String strZza = zzfui.zza(view);
                                        if (strZza != null) {
                                            str = strZza;
                                            break;
                                        }
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        if (parent instanceof View) {
                                            view = (View) parent;
                                        } else {
                                            view = null;
                                        }
                                    } else {
                                        this.zzd.addAll(hashSet);
                                        break;
                                    }
                                }
                            }
                        }
                        if (str == null) {
                            this.zze.add(strZzh);
                            this.zza.put(viewZzi, strZzh);
                            for (zzftk zzftkVar : zzfsnVar.zzf()) {
                                View view2 = (View) zzftkVar.zza().get();
                                if (view2 != null) {
                                    HashMap map2 = this.zzb;
                                    zzfuj zzfujVar = (zzfuj) map2.get(view2);
                                    if (zzfujVar != null) {
                                        zzfujVar.zza(zzfsnVar.zzh());
                                    } else {
                                        map2.put(view2, new zzfuj(zzftkVar, zzfsnVar.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(strZzh);
                            this.zzc.put(strZzh, viewZzi);
                            this.zzg.put(strZzh, str);
                        }
                    } else {
                        this.zzf.add(strZzh);
                        this.zzg.put(strZzh, "noAdView");
                    }
                }
            }
        }
    }
}
