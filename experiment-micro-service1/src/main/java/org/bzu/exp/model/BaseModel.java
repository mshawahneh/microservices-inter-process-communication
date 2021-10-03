/**
 * 
 */
package org.bzu.exp.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Data;

/**
 * @author mshawahn
 * 
 *
 */
@Data
@MappedSuperclass
public abstract class BaseModel extends AbstractPersistable<Long> implements Comparable<BaseModel>{

	@CreationTimestamp
	@Column(name = "created_at", updatable = false, nullable = false)
	protected Instant createdAt;
	
	@UpdateTimestamp
	@Column(name = "modified_at")
	protected Instant modifiedAt;
	
	@Column
	@Version
	protected long version;
	
	@Override
	public int compareTo(BaseModel o) {
		
		return getId().compareTo(o.getId());
	}
}
