package org.zstack.storage.ceph;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by frank on 7/27/2015.
 */
@MappedSuperclass
public class CephMonAO {
    @Id
    @Column
    private String uuid;

    @Column
    private String sshUsername;

    @Column
    private String sshPassword;

    @Column
    private String hostname;

    @Column
    private MonStatus status;

    @Column
    private Timestamp createDate;

    @Column
    private Timestamp lastOpDate;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSshUsername() {
        return sshUsername;
    }

    public void setSshUsername(String sshUsername) {
        this.sshUsername = sshUsername;
    }

    public String getSshPassword() {
        return sshPassword;
    }

    public void setSshPassword(String sshPassword) {
        this.sshPassword = sshPassword;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public MonStatus getStatus() {
        return status;
    }

    public void setStatus(MonStatus status) {
        this.status = status;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getLastOpDate() {
        return lastOpDate;
    }

    public void setLastOpDate(Timestamp lastOpDate) {
        this.lastOpDate = lastOpDate;
    }
}
