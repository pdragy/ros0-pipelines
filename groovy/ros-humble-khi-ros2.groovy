node {
    git url: 'https://github.com/Kawasaki-Robotics/khi_ros2.git', branch: 'main'
    registerROS('ros:humble-ros-base', [
        'ros-humble-hardware-interface',
        'ros-humble-moveit-common'
    ], [
        'ros-humble-controller-manager',
        'ros-humble-force-torque-sensor-broadcaster',
        'ros-humble-joint-state-broadcaster',
        'ros-humble-joint-trajectory-controller'
    ])
}
