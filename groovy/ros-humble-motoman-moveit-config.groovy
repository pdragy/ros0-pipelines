node {
    git url: 'https://github.com/ivanrulik/motoman_moveit_config.git', branch: 'main'
    registerROS('ros:humble-desktop-full', [
        'ros-humble-moveit-common',
        'ros-humble-moveit-ros-move-group',
        'ros-humble-moveit-ros-planning',
        'ros-humble-moveit-ros-planning-interface',
        'ros-humble-moveit-ros-visualization',
        'ros-humble-moveit-simple-controller-manager',
        'ros-humble-pilz-industrial-motion-planner',
        'ros-humble-ros2-control'
    ], [])
}
