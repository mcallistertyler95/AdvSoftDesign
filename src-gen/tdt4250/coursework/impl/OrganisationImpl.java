/**
 */
package tdt4250.coursework.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.coursework.CourseworkPackage;
import tdt4250.coursework.Organisation;
import tdt4250.coursework.Staff;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.impl.OrganisationImpl#getDepartmentName <em>Department Name</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.OrganisationImpl#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationImpl extends MinimalEObjectImpl.Container implements Organisation {
	/**
	 * The default value of the '{@link #getDepartmentName() <em>Department Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartmentName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepartmentName() <em>Department Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartmentName()
	 * @generated
	 * @ordered
	 */
	protected String departmentName = DEPARTMENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<Staff> staff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseworkPackage.Literals.ORGANISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartmentName(String newDepartmentName) {
		String oldDepartmentName = departmentName;
		departmentName = newDepartmentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.ORGANISATION__DEPARTMENT_NAME,
					oldDepartmentName, departmentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Staff> getStaff() {
		if (staff == null) {
			staff = new EObjectContainmentWithInverseEList<Staff>(Staff.class, this,
					CourseworkPackage.ORGANISATION__STAFF, CourseworkPackage.STAFF__WORKS_IN);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CourseworkPackage.ORGANISATION__STAFF:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStaff()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CourseworkPackage.ORGANISATION__STAFF:
			return ((InternalEList<?>) getStaff()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CourseworkPackage.ORGANISATION__DEPARTMENT_NAME:
			return getDepartmentName();
		case CourseworkPackage.ORGANISATION__STAFF:
			return getStaff();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CourseworkPackage.ORGANISATION__DEPARTMENT_NAME:
			setDepartmentName((String) newValue);
			return;
		case CourseworkPackage.ORGANISATION__STAFF:
			getStaff().clear();
			getStaff().addAll((Collection<? extends Staff>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CourseworkPackage.ORGANISATION__DEPARTMENT_NAME:
			setDepartmentName(DEPARTMENT_NAME_EDEFAULT);
			return;
		case CourseworkPackage.ORGANISATION__STAFF:
			getStaff().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CourseworkPackage.ORGANISATION__DEPARTMENT_NAME:
			return DEPARTMENT_NAME_EDEFAULT == null ? departmentName != null
					: !DEPARTMENT_NAME_EDEFAULT.equals(departmentName);
		case CourseworkPackage.ORGANISATION__STAFF:
			return staff != null && !staff.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (departmentName: ");
		result.append(departmentName);
		result.append(')');
		return result.toString();
	}

} //OrganisationImpl
