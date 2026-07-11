package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class ViewInfoStore {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final SimpleArrayMap f41241n = new SimpleArrayMap();
    final LongSparseArray rl = new LongSparseArray();

    static class InfoRecord {
        static Pools.Pool nr = new Pools.SimplePool(20);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41242n;
        RecyclerView.ItemAnimator.ItemHolderInfo rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        RecyclerView.ItemAnimator.ItemHolderInfo f41243t;

        static void t(InfoRecord infoRecord) {
            infoRecord.f41242n = 0;
            infoRecord.rl = null;
            infoRecord.f41243t = null;
            nr.n(infoRecord);
        }

        static void n() {
            while (nr.acquire() != null) {
            }
        }

        static InfoRecord rl() {
            InfoRecord infoRecord = (InfoRecord) nr.acquire();
            return infoRecord == null ? new InfoRecord() : infoRecord;
        }

        private InfoRecord() {
        }
    }

    interface ProcessCallback {
        void n(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void nr(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void rl(RecyclerView.ViewHolder viewHolder);

        void t(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);
    }

    RecyclerView.ItemAnimator.ItemHolderInfo ty(RecyclerView.ViewHolder viewHolder) {
        return qie(viewHolder, 4);
    }

    private RecyclerView.ItemAnimator.ItemHolderInfo qie(RecyclerView.ViewHolder viewHolder, int i2) {
        InfoRecord infoRecord;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int iUo = this.f41241n.Uo(viewHolder);
        if (iUo >= 0 && (infoRecord = (InfoRecord) this.f41241n.az(iUo)) != null) {
            int i3 = infoRecord.f41242n;
            if ((i3 & i2) != 0) {
                int i5 = (~i2) & i3;
                infoRecord.f41242n = i5;
                if (i2 == 4) {
                    itemHolderInfo = infoRecord.rl;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    itemHolderInfo = infoRecord.f41243t;
                }
                if ((i5 & 12) == 0) {
                    this.f41241n.gh(iUo);
                    InfoRecord.t(infoRecord);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    void HI(ProcessCallback processCallback) {
        for (int size = this.f41241n.getSize() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.f41241n.xMQ(size);
            InfoRecord infoRecord = (InfoRecord) this.f41241n.gh(size);
            int i2 = infoRecord.f41242n;
            if ((i2 & 3) == 3) {
                processCallback.rl(viewHolder);
            } else if ((i2 & 1) != 0) {
                RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo = infoRecord.rl;
                if (itemHolderInfo == null) {
                    processCallback.rl(viewHolder);
                } else {
                    processCallback.t(viewHolder, itemHolderInfo, infoRecord.f41243t);
                }
            } else if ((i2 & 14) == 14) {
                processCallback.n(viewHolder, infoRecord.rl, infoRecord.f41243t);
            } else if ((i2 & 12) == 12) {
                processCallback.nr(viewHolder, infoRecord.rl, infoRecord.f41243t);
            } else if ((i2 & 4) != 0) {
                processCallback.t(viewHolder, infoRecord.rl, null);
            } else if ((i2 & 8) != 0) {
                processCallback.n(viewHolder, infoRecord.rl, infoRecord.f41243t);
            }
            InfoRecord.t(infoRecord);
        }
    }

    void Ik(RecyclerView.ViewHolder viewHolder) {
        int iTy = this.rl.ty() - 1;
        while (true) {
            if (iTy < 0) {
                break;
            }
            if (viewHolder == this.rl.HI(iTy)) {
                this.rl.az(iTy);
                break;
            }
            iTy--;
        }
        InfoRecord infoRecord = (InfoRecord) this.f41241n.remove(viewHolder);
        if (infoRecord != null) {
            InfoRecord.t(infoRecord);
        }
    }

    void J2() {
        this.f41241n.clear();
        this.rl.rl();
    }

    boolean KN(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.f41241n.get(viewHolder);
        return (infoRecord == null || (infoRecord.f41242n & 1) == 0) ? false : true;
    }

    void O(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecordRl = (InfoRecord) this.f41241n.get(viewHolder);
        if (infoRecordRl == null) {
            infoRecordRl = InfoRecord.rl();
            this.f41241n.put(viewHolder, infoRecordRl);
        }
        infoRecordRl.rl = itemHolderInfo;
        infoRecordRl.f41242n |= 4;
    }

    RecyclerView.ViewHolder Uo(long j2) {
        return (RecyclerView.ViewHolder) this.rl.O(j2);
    }

    RecyclerView.ItemAnimator.ItemHolderInfo az(RecyclerView.ViewHolder viewHolder) {
        return qie(viewHolder, 8);
    }

    void ck(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.f41241n.get(viewHolder);
        if (infoRecord == null) {
            return;
        }
        infoRecord.f41242n &= -2;
    }

    void n(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecordRl = (InfoRecord) this.f41241n.get(viewHolder);
        if (infoRecordRl == null) {
            infoRecordRl = InfoRecord.rl();
            this.f41241n.put(viewHolder, infoRecordRl);
        }
        infoRecordRl.f41242n |= 2;
        infoRecordRl.rl = itemHolderInfo;
    }

    void nr(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecordRl = (InfoRecord) this.f41241n.get(viewHolder);
        if (infoRecordRl == null) {
            infoRecordRl = InfoRecord.rl();
            this.f41241n.put(viewHolder, infoRecordRl);
        }
        infoRecordRl.f41243t = itemHolderInfo;
        infoRecordRl.f41242n |= 8;
    }

    void rl(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecordRl = (InfoRecord) this.f41241n.get(viewHolder);
        if (infoRecordRl == null) {
            infoRecordRl = InfoRecord.rl();
            this.f41241n.put(viewHolder, infoRecordRl);
        }
        infoRecordRl.f41242n |= 1;
    }

    void t(long j2, RecyclerView.ViewHolder viewHolder) {
        this.rl.gh(j2, viewHolder);
    }

    boolean xMQ(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.f41241n.get(viewHolder);
        return (infoRecord == null || (infoRecord.f41242n & 4) == 0) ? false : true;
    }

    ViewInfoStore() {
    }

    public void gh(RecyclerView.ViewHolder viewHolder) {
        ck(viewHolder);
    }

    void mUb() {
        InfoRecord.n();
    }
}
