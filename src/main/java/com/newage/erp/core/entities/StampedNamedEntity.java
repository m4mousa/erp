package com.newage.erp.core.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author mohammed
 */
@MappedSuperclass
public class StampedNamedEntity extends StampedEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "NAME", unique = true, nullable = false)
	private String name;

	public StampedNamedEntity() {
	}

	public StampedNamedEntity(Long id) {
		super(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
