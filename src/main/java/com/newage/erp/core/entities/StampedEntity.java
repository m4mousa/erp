package com.newage.erp.core.entities;

import com.newage.erp.security.entities.SecurityUser;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mohammed
 */
@MappedSuperclass
@EntityListeners(EntityListener.class)
public class StampedEntity extends SuperEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "CREATE_TIME", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	protected Date createTime;
	@Column(name = "UPDATE_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date updateTime;
	@JoinColumn(name = "CREATE_USER", nullable = false)
	@ManyToOne
	protected SecurityUser createUser;
	@JoinColumn(name = "UPDATE_USER")
	@ManyToOne
	protected SecurityUser updateUser;

	public StampedEntity() {
	}

	public StampedEntity(Long id) {
		super(id);
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public SecurityUser getCreateUser() {
		return createUser;
	}

	public void setCreateUser(SecurityUser createUser) {
		this.createUser = createUser;
	}

	public SecurityUser getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(SecurityUser updateUser) {
		this.updateUser = updateUser;
	}
}
