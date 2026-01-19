node {
    git url: 'https://github.com/Epson-Robots/epson-robot-ros2.git', branch: 'main'
    registerROS('ros:humble-ros-base', [
        'ros-humble-controller-manager',
        'ros-humble-joint-trajectory-controller',
        'ros-humble-moveit-ros-planning-interface'
    ], [])
}
